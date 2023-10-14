/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

public abstract class Animal { 
    protected String sonido; /* Atributo que identifica el sonido emitido por un animal */
    protected String alimentos; /* Atributo que identifica los alimentos que consume un animal */
    protected String habitat; /* Atributo que identifica el hábitat de un animal */
    protected String nombreCientifico; /* Atributo que identifica el nombre científico de un animal */
    public abstract String getNombreCientifico();
    public abstract String getSonido();
    public abstract String getAlimentos();
    public abstract String getHabitat();
}

