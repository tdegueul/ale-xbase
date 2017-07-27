:: Interpreter
echo "Interpreter 1"
java -jar interpreter-benchmark.jar ./xmi/ testperformance_variant1 interpreter_
echo "Interpreter 2"
java -jar interpreter-benchmark.jar ./xmi/ testperformance_variant2 interpreter_
echo "Interpreter 3"
java -jar interpreter-benchmark.jar ./xmi/ testperformance_variant3 interpreter_

:: Visitor
echo "Visitor 1"
java -jar visitor-benchmark.jar ./xmi/ testperformance_variant1 visitor_
echo "Visitor 2"
java -jar visitor-benchmark.jar ./xmi/ testperformance_variant2 visitor_
echo "Visitor 3"
java -jar visitor-benchmark.jar ./xmi/ testperformance_variant3 visitor_

:: Switch
echo "Switch 1"
java -jar switch-benchmark.jar ./xmi/ testperformance_variant1 switch_
echo "Switch 2"
java -jar switch-benchmark.jar ./xmi/ testperformance_variant2 switch_
echo "Switch 3"
java -jar switch-benchmark.jar ./xmi/ testperformance_variant3 switch_

:: Monolithic
echo "Monolithic 1"
java -jar monolithic-revisitor-benchmark.jar ./xmi/ testperformance_variant1 monolithic_
echo "Monolithic 2"
java -jar monolithic-revisitor-benchmark.jar ./xmi/ testperformance_variant2 monolithic_
echo "Monolithic 3"
java -jar monolithic-revisitor-benchmark.jar ./xmi/ testperformance_variant3 monolithic_

:: Modular
echo "Modular 1"
java -jar modular-revisitor-benchmark.jar ./xmi/modular/ testperformance_variant1 modular_
echo "Modular 2"
java -jar modular-revisitor-benchmark.jar ./xmi/modular/ testperformance_variant2 modular_
echo "Modular 3"
java -jar modular-revisitor-benchmark.jar ./xmi/modular/ testperformance_variant3 modular_

