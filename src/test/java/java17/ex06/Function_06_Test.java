package java17.ex06;


import java.util.function.Supplier;

import org.junit.Test;

import java17.data.Person;

/**
 * Exercice 06 - java.util.function.Supplier
 */
public class Function_06_Test {


    // tag::formatAge[]
    // TODO compléter la méthode
    // TODO la méthode retourne une chaîne de caractères de la forme [age=<AGE>] (exemple : [age=12])
    String formatAge(Supplier<Person> supplier) {
    	Person person = supplier.get();
        int age = person.getAge();
        return "[age=" + age + "]";
    }
    // end::formatAge[]


    @Test
    public void test_supplier_formatAge() throws Exception {
        
    	Supplier<Person> personSupplier = () -> new Person("John", "John", 35, "password");
    	// TODO compléter le test unitaire pour qu'il soit passant
        String result = formatAge(personSupplier);

        assert result.equals("[age=35]");
    }

}
