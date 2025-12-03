# Spring Framework Learning Repository

This repository contains my hands-on practice and notes from learning the Spring Framework. It includes foundational concepts, annotations, configuration styles, and small demo applications showcasing how Spring manages dependency injection, component scanning, scopes, and application contexts.

## 📁 Project Structure Overview

### **src/main/java/com/SpringBegin/learn_spring_framework**
- **examples/** – Basic demonstrations of Spring application setup, XML/annotation configs, and context loading.
  - **a0/** – Intro-level Spring Context launcher.
  - **a1/** – Dependency Injection examples with multiple variations.
  - **scope/** – Bean scope demonstration (singleton/prototype).

- **game/** – Small examples showing DI, interface-driven design, and loose coupling.
  - `ContraGame`, `MarioGame`, `PacManGame`
  - `GamingConsole` interface
  - `GameRunner` orchestrating gameplay via injected implementations
 
- **playstations/** – Custom configurations and bean setup (`PlayStationConfig`, `PlayStationAppBeans`).

- **helloworld_start/** – Beginner-level Spring configuration and bean definitions.

### **notes/**
- **screenshots/** – Udemy course presentation slides.
- Notes summarizing Spring annotations, dependency injection, JavaBeans, Jakarta EE basics, and the differences between XML and annotation-based configurations.

## 🚀 What This Repo Demonstrates
- Core Spring annotations (@Component, @Bean, @Configuration, @Autowired)
- Dependency Injection (constructor, setter & field)
- ApplicationContext usage
- Bean scopes and lifecycle
- Modular configuration using separate config classes
- Practical mini-projects to understand loose coupling and interfaces
