package com.fastcampus.de.clip11_5;

public class AccessModifierTest {
    private void messageInside() {
        System.out.println("this is private modifier");
    }

    void messageDefault(){
        System.out.println("This is default modifier");
    }

    protected void messageProtected() {
        System.out.println("this is protected modifier");
    }

    public void messagePublic() {
        System.out.println("this is public modifier");
    }
}
