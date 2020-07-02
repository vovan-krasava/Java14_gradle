package syntax;

public class HelperNPE {
    public static void demo(){
        var zoo = new Zoo();
        try{
            zoo.getDog().getAnimal().getType();
        } catch (NullPointerException e){
            e.printStackTrace();
        }

    }
}

class Zoo {
    private Dog dog = new Dog();

    public Dog getDog(){
        return dog;
    }


}
class Dog {
    private Animal animal;

    public Animal getAnimal(){
        return animal;
    }

}
class Animal {
    private String type;

    public String getType(){
        return type;
    }
}






