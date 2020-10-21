package common;

import java.util.*;

class Member {
    // fields
    private String id;
    private String pw;
    private String name;
    // Constructors
    public Member(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
    }
    // getters, setters
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setPw(String pw) {
        this.pw = pw;
    }
    public String getPw() {
        return pw;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

public class Morning1021 {
    public static void main(String[] args) {
        // for(String str : args) {
        //     System.out.println(str);
        // }
        List<Member> members = new ArrayList<>();
        members.add(new Member("user1", "1111", "Hong"));
        members.add(new Member("user2", "2222", "Hwang"));
        members.add(new Member("user3", "3333", "Park"));


    }
}