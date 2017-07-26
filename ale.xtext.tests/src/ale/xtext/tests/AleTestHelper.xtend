package ale.xtext.tests

import java.lang.invoke.MethodHandles
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy
import org.eclipse.xtext.xbase.testing.CompilationTestHelper.Result

class AleTestHelper {
	def Object invokeRevisitorMethod(Result res, Object obj, String rvName, String methodName, Object[] args) {
		val rvCls = res.compiledClasses.get(rvName)
		val dollar = rvCls.methods.findFirst[name == "$" && parameters.head.type.isAssignableFrom(obj.class)]

		val construct = typeof(MethodHandles.Lookup).getDeclaredConstructor(typeof(Class), typeof(int))
		construct.accessible = true

		val rvImpl = Proxy::newProxyInstance(
			res.classLoader,
			#[rvCls],
			new InvocationHandler() {
				override invoke(Object proxy, Method method, Object[] args) throws Throwable {
					if (method.^default) {
						val decl = method.declaringClass
						return
							construct.newInstance(decl, MethodHandles.Lookup::PRIVATE)
							.unreflectSpecial(method, decl)
							.bindTo(proxy)
							.invokeWithArguments(args)
					}
				}
		})

		val operationObj = dollar.invoke(rvImpl, obj)
		val method = operationObj.class.methods.findFirst[name == methodName]

		return method.invoke(operationObj, args)
	}

	def Object invokeRevisitorMethod(Result res, Object obj, String rvName, String methodName) {
		return invokeRevisitorMethod(res, obj, rvName, methodName, null)
	}
}
