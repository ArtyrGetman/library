public class Member {
    private String name;
    private int memberId;

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void printMemberInfo() {
        System.out.println("Name: " + name + ", Member ID: " + memberId);
    }
}
