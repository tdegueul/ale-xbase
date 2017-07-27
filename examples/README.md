# ALE Examples & Benchmarks

This repository is structured as follows:

* [simple](./simple): Toy examples demonstrating semantics definition and language modularity in ALE
* [fUML](./fUML): An implementation of fUML using ALE inspired by [the Model Execution Case](http://www.transformation-tool-contest.eu/2015/cfs.html) of the Transformation Tool Contest 2015 (TTC'15).

## Playing with the examples

1. Setup an ALE environment following the [installation instructions](https://github.com/manuelleduc/ale-compiler)
1. Clone this repository locally, eg. `git clone https://github.com/manuelleduc/ale-compiler-benchmarks`
1. Import all the projects contained in the `simple` directory in Eclipse
..* `File -> Import -> Existing Projects into Workspace`
..* Select the `simple` directory as root directory in the dialog
..* Check all the projects
..* Finish

* Each project contains a launch configuration that can be used to run it
* To re-generate the *Revisitor* interfaces: `Right click -> ALE -> Generate Revisitor interface` on an Ecore file generates the corresponding *Revisitor interface* in the *src* directory of the current project
* To re-generate the *Revisitor* implementations: `Right click -> ALE -> Generate Revisitor implementation` on an ALE file generates the corresponding *Revisitor* implementation in the *src* directory of the current project

## Running the benchmarks

This repository contains benchmarks comparing different implementations of the execution semantics of fUML.
The concrete semantics code is common to all implementations: the only variation is the pattern used to implement it.

* [Interpreter](./fUML/implementations/Interpreter): The reference implementation of TTC'15 following the Interpreter pattern
* [Visitor](./fUML/implementations/Visitor): An implementation following the classical Visitor pattern
* [EMF Switch](./fUML/implementations/EMFSwitch): An implementation using the Switch mechanism of EMF
* [MonolithicRevisitor](./fUML/implementations/MonolithicRevisitor): A first *Revisitor* implementation where the runtime concepts of the activity diagram (Tokens, Offers, etc.) are already merged in a single metamodel
* [ModularRevisitor](./fUML/implementations/ModularRevisitor): An alternative *Revisitor* implementation based on a static metamodel defining the abstract syntax of activity diagrams and another metamodel defining the runtime concepts

The [fUML/activitydiagram](./fUML/activitydiagram) contains the reference implementation of activity diagrams from TTC'15, plus a variant where the static concepts and the runtime concepts are modularly split in two different metamodels.

* For convenience, we provide pre-compiled JARs for all the projects and a Bash script that runs all of the benchmarks one after the other:
  1. Navigate to the [./fUML/benchmarks](./fUML/benchmarks) directory
  2. Run the benchmarks: `./benchmark.sh` or `benchmark.bat`

* Otherwise, import all the Eclipse projects contained in the [fUML](./fUML) directory and wait for all of them to compile without error
* Execute the BenchmarkGeneric class of the benchmark project of your choice (one per implementation folder). BenchmarkGeneric's main function expects 3 parameters:
  1. The path to a folder with the *.xmi models of the benchmark
  2. The name of the test to run (testperformance_variant1, testperformance_variant2, or testperformance_variant3)
  3. A prefix for the *.csv file that will store the results

Each benchmark executes every performance test of the TTC'15 contest 500 times after 50 warmups everytime.

