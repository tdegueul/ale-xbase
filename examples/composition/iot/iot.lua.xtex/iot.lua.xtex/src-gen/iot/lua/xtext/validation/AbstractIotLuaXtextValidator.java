/*
 * generated by Xtext 2.12.0
 */
package iot.lua.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractIotLuaXtextValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.example.org/iot"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.example.org/iot_lua"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://idlmm/1.0"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://lua/1.0"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://activitydiagram/1.0"));
		return result;
	}
	
}
