# Activité Pratique N°1 – Injection des dépendances 


## Objectif
Ce projet illustre la **mise en œuvre de l'injection des dépendances** en Java, en utilisant :
- Couplage faible entre les couches DAO et Métier
- Injection statique et dynamique
- Framework Spring (XML et annotations)

## Structure du projet
```text
src/main/java
└── com.elmakaoui
    ├── dao          # IDao interface and DaoImpl implementation
    ├── ext          # Extension: Alternative implementation (DaoImplV2)
    ├── metier       # IMetier interface and MetierImpl logic
    └── pres         # Presentation classes (Entry points)
        ├── Pres1.java              (Static Injection)
        ├── Pres2.java              (Dynamic Injection)
        ├── PresSpringXML.java       (Spring XML)
        └── PresSpringAnnotation.java (Spring Annotations)

src/main/resources
├── config.xml       # Spring Bean definitions
└── config.txt       # Configuration for Reflection-based injection
```

## Fonctionnalités
1. **DAO Layer**  
   - `IDao` : interface avec `getData()`  
   - `DaoImpl` et `DaoImplV2` : implémentations concrètes  

2. **Metier Layer**  
   - `IMetier` : interface avec `calcul()`  
   - `MetierImpl` : dépend de IDao (injection via constructeur ou setter)  

3. **Présentation**  
   - `Pres1` : injection manuelle (statique)  
   - `Pres2` : injection dynamique via `config.txt`
   - `PresSpringXML` : injection via Spring XML (`config.xml`)  
   - `PresSpringAnnotation` : injection via annotations Spring (`@Component`, `@Service`)  

## Exécution
- **Statique** : `Pres1.java`  
- **Dynamique** : `Pres2.java` (nécessite `config.txt`)  
- **Spring XML** : `PresSpringXML.java` (nécessite `config.xml`)  
- **Spring Annotation** : `PresSpringAnnotation.java`  

## Concepts illustrés
- Couplage faible / Inversion de contrôle
- Injection de dépendances : statique, dynamique, Spring XML, Spring annotations  
- Modularité et maintenabilité en Java