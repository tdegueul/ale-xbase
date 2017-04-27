# Ale Compiler

## Introduction
The *Revisitors* are a new language implementation pattern that enables independent
extensibility of the syntax and the semantics of metamodel-based xDSMLs with
incremental compilation and without anticipation. This pattern is inspured by
the [Object Algebra](https://dl.acm.org/citation.cfm?id=2367167) design pattern.

On top of the *Revisitors* we introduce *ALE*, a high-level specification language supporting modular extension of both syntax and semantics where the *Revisitor* pattern ensures separate compilation of language modules.

*Ale* is tightly integrated with the [Eclipse Modeling Framework](https://www.eclipse.org/modeling/emf/) (EMF) and rely on the Ecore meta-language for the definition of the absatract syntax of the xDSMLs. Operation semantics is defined using *Ale* using *open class* definitions. *Ale* is bundle as a set of Eclipse plug-ins.

## Installation

