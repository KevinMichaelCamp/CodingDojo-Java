public class ProjectTest {
    public static void main(String[] args) {
        Project p1 = new Project();
        Project p2 = new Project("Checkers");
        Project p3 = new Project("Pinky", "Take over the world!");
        Project p4 = new Project("Project X", "Build bridge", 7654321);
        Portfolio myPortfolio = new Portfolio();

        // System.out.println(p1.elevatorPitch());
        // System.out.println(p2.elevatorPitch());
        // System.out.println(p3.elevatorPitch());
        // System.out.println(p4.elevatorPitch());

        p1.setName("Red Rover");
        p1.setDescription("Come over!");

        // System.out.println(p1.elevatorPitch());
        // System.out.println(p2.getName());

        p1.setInitialCost(3.25);
        p3.setInitialCost(1000000);

        // // System.out.println(p1.elevatorPitch());
        // // System.out.println(p2.elevatorPitch());
        // // System.out.println(p3.elevatorPitch());

        myPortfolio.AddToPortfolio(p1);
        myPortfolio.AddToPortfolio(p2);
        myPortfolio.AddToPortfolio(p3);
        myPortfolio.AddToPortfolio(p4);
        System.out.println(myPortfolio.getPortfolio());
        myPortfolio.showPortfolio();
    }
}