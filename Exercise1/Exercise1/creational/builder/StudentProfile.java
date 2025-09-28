package creational.builder;

// Class representing a student profile
public class StudentProfile {
    private final String name;
    private final String rollNo;
    private final String department;
    private final String email;
    private final String phone;

    private StudentProfile(Builder builder) {
        this.name = builder.name;
        this.rollNo = builder.rollNo;
        this.department = builder.department;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    // Static Builder class
    public static class Builder {
        private final String name;
        private final String rollNo;
        private String department = "Not Assigned";
        private String email = "Not Provided";
        private String phone = "Not Provided";

        public Builder(String name, String rollNo) {
            if (name == null || name.isEmpty() || rollNo == null || rollNo.isEmpty()) {
                throw new IllegalArgumentException("Name and Roll No are mandatory!");
            }
            this.name = name;
            this.rollNo = rollNo;
        }

        public Builder department(String department) {
            this.department = department;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public StudentProfile build() {
            return new StudentProfile(this);
        }
    }

    @Override
    public String toString() {
        return "StudentProfile{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
