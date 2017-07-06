# Ale Compiler

## Introduction
The *Revisitors* are a new language implementation pattern that enables independent
extensibility of the syntax and the semantics of metamodel-based xDSMLs with
incremental compilation and without anticipation. This pattern is inspired by
the [Object Algebra](https://dl.acm.org/citation.cfm?id=2367167) design pattern.

On top of the *Revisitors* we introduce *ALE*, a high-level specification language supporting modular extension of both syntax and semantics where the *Revisitor* pattern ensures separate compilation of language modules.

*Ale* is tightly integrated with the [Eclipse Modeling Framework](https://www.eclipse.org/modeling/emf/) (EMF) and rely on the Ecore meta-language for the definition of the abstract syntax of the xDSMLs. Operation semantics is defined with *Ale* using *open class* definitions. *Ale* is bundled as a set of Eclipse plug-ins.

## Installation

Setup of an Ale development environment:

1. Download and Start *Eclipse IDE for Java and DSL Developers* - Version Neon 3 : https://www.eclipse.org/downloads/packages/eclipse-ide-java-and-dsl-developers/neon3
1. Install the ale plugins using the update site: http://gemoc.org/ale/revisitor/updatesite/. Follow the [procedure](http://help.eclipse.org/oxygen/index.jsp?topic=/org.eclipse.platform.doc.user/tasks/tasks-127.htm) and select every plugin available.

## Usage

Once the Ale development environment started, two operations are available.

### Generation of a Revisitor interface

On a **\*.ecore** file: `Right click -> ALE -> Generate Revisitor interface` produces a Revisitor interface
for the selected metamodel in the *src* directory of the current project.


### Generation of a Revisitor semantic

On a **\*.ale** file: `Right click -> ALE -> Generate Revisitor implementation` produces a Revisitor implementation
of the selected ale specification in the *src* directory of the current project.
