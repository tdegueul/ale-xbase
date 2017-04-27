package ale.compiler.generator.util;

import ale.xtext.ale.AleClass;
import ale.xtext.ale.Root;

public class NameUtil {
	public String rootNameOrDefault(Root root) {
		if(root == null) return "common";
		else return root.getName();
	}
	
	public String rootNameOrDefault(AleClass root) {
		if(root == null) return "common";
		else return ((Root)root.eContainer()).getName();
	}
}
