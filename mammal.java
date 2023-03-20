class Animal
{
    void eat()
    {
        System.out.println("eating...");
    }    
}
class mammal extends Animal
{
    void eat()
    {
        System.out.println("eating vegetables");
    }
    public static void main (String [] args)
    {
        Animal m = new mammal();
        m.eat();
    }

}