
package pbo1119012latihan53;

/**
 *  NAMA  : DAMAI SAPUTRA LAOLI
 *  KELAS : IF-1
 *  NIM   : 10119012
 * @author damai
 */
public class PBO1119012Latihan53 {

    
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit("Peter",false,"Grass",4,"Grey");
        System.out.println("Hello, his name is " + rabbit1.getName());
        System.out.println(rabbit1.getName() + " is Vegetarian? " + rabbit1.isVegetarian());
        System.out.println(rabbit1.getName() + " eat " + rabbit1.getEats());
        System.out.println(rabbit1.getName() + " has " + rabbit1.getNoOfLegs() + " legs");
        System.out.println(rabbit1.getName() + " color is " + rabbit1.getColor());
    }
}
