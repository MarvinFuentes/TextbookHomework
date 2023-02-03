/**
 * @class: Cycle
 * @aurthor: Marvin Fuentes
 * @course: ITEC 2140 section 4
 * @written: January 26, 2023
 */
public class Cycle {
    public static void main(String[] args) {
        int bicycles = 10; // Declaring the amount of bicycles in the shop.
        int wheels = bicycles * 2; // Multiplying the amount of bicycles by the amount of wheels on them.
        System.out.println("Amount of tricycles: " + ((47 - wheels) / 3));
        // Subtracting the total amount of wheels and then diving by 3 to state amount of tricycles.
    }
}
