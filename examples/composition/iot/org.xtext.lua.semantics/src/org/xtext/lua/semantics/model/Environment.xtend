package org.xtext.lua.semantics.model

import java.util.HashMap
import java.util.Map
import java.util.Stack
import org.xtext.lua.lua.Function

public class Environment {
	Environment parent
	val values = new Stack<Object>
	val variables = new HashMap<String, Object>
	val functions = new HashMap<String, Function>

	def getParent() {
		parent
	}

	def setParent(Environment e) {
		parent = e
	}

	def getVariable(String s) {
		variables.get(s)
	}

	def pushValue(Object o) {
		values.push(o)
	}

	def popValue() {
		values.pop
	}

	def putFunction(String s, Function f) {
		functions.put(s, f)
	}

	def Function getFunction(String s) {
		return functions.get(s)
	}

	def putVariable(String s, Object o) {
		variables.put(s, o)
	}

	def putAllVariables(Map<String, Object> v) {
		variables.putAll(v)
	}

	def putAllFunctions(Map<String, Function> f) {
		functions.putAll(f)
	}

	def pushAllValues(Stack<Object> v) {
		values.addAll(v)
	}

	def getValues() {
		values
	}

	def getVariables() {
		variables
	}

	def getFunctions() {
		functions
	}
}
