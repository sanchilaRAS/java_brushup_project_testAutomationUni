package chapter10;

//Polymorphism
public class Zoo {

    public static void main(String[] args){


        Dog rocky=new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        System.out.println("---");

        Animal sasha=new Dog();
        sasha.makeSound();

        sasha=new Cat();
        sasha.makeSound();
        ((Cat) sasha).scratch();
        feed(sasha);

    }

    public static void feed(Animal animal){
        if (animal instanceof Dog){
            System.out.println("here's your dog food");
        } else if (animal instanceof Cat) {
            System.out.println("here's your cat food");
        }else {
            System.out.println("");
        }
    }

}
