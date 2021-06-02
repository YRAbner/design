package com.geely.design.principle.demeter;

public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.commandCheckNumber(new TeamLeader());
    }
}
