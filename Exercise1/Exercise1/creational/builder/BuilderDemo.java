package creational.builder;

public class BuilderDemo {
    public static void run() {
        System.out.println("\n--- Builder Pattern Demo ---");

        StudentProfile profile = new StudentProfile.Builder("Neela Nithyashree", "CS101")
                .department("CSE")
                .email("neela@example.com")
                .phone("9876543210")
                .build();

        System.out.println(profile);

        // Example of minimal profile
        StudentProfile simpleProfile = new StudentProfile.Builder("Student2", "CS102").build();
        System.out.println(simpleProfile);
    }
}
