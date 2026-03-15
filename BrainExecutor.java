public class BrainExecutor {
    public static void main(String[] args) {
        Brain b1 = new Brain("Human", 1400.0, 86, 20.0, true, "Cognition", 4, 1.0, "2.5 Petabytes", true, 60.0, "Left", 150.0, true, "Vision", 12, 120.0, "Complex", true, "Thinking");
        Brain b2 = new Brain("Dolphin", 1600.0, 70, 15.0, true, "Echolocation", 4, 1.5, "High", true, 55.0, "Right", 180.0, true, "Auditory", 12, 100.0, "Complex", true, "Swimming");
        Brain b3 = new Brain("Elephant", 5000.0, 250, 10.0, true, "Social Bonding", 4, 2.0, "Very High", true, 40.0, "Balanced", 500.0, true, "Olfactory", 12, 300.0, "Complex", true, "Walking");
        Brain b4 = new Brain("Chimpanzee", 400.0, 28, 18.0, true, "Problem Solving", 4, 1.1, "Moderate", true, 50.0, "Left", 100.0, true, "Vision", 12, 60.0, "Complex", true, "Eating");
        Brain b5 = new Brain("Mouse", 0.4, 0, 5.0, true, "Survival", 3, 0.8, "Low", true, 100.0, "Balanced", 2.0, true, "Whiskers", 12, 5.0, "Simple", false, "Hiding");
        Brain b6 = new Brain("Whale", 8000.0, 200, 12.0, true, "Navigation", 4, 2.5, "Extreme", true, 30.0, "Right", 1000.0, true, "Auditory", 12, 500.0, "Complex", true, "Diving");
        Brain b7 = new Brain("Parrot", 2.0, 1, 15.0, true, "Communication", 3, 1.0, "High", true, 80.0, "Left", 5.0, true, "Vision", 12, 10.0, "Complex", true, "Mimicking");
        Brain b8 = new Brain("Octopus", 0.2, 0, 10.0, true, "Motor Control", 0, 1.0, "Distributed", false, 45.0, "None", 0.0, true, "Touch", 0, 15.0, "Radial", true, "Camouflaging");
        Brain b9 = new Brain("Cat", 30.0, 1, 12.0, true, "Predatory Instinct", 4, 1.2, "Moderate", true, 70.0, "Balanced", 20.0, true, "Hearing", 12, 25.0, "Complex", true, "Sleeping");
        Brain b10 = new Brain("Dog", 64.0, 2, 13.0, true, "Social Obedience", 4, 1.3, "Moderate", true, 65.0, "Right", 30.0, true, "Olfactory", 12, 35.0, "Complex", true, "Barking");

        b1.display(); b2.display(); b3.display(); b4.display(); b5.display();
        b6.display(); b7.display(); b8.display(); b9.display(); b10.display();
    }
}