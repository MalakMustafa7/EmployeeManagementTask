package org.example.enumuration;

public enum JobLevel {
    JUNIOR(1),
    MID(2),
    SENIOR(3),
    LEAD(4);



    private final int levelCode;
    JobLevel(int levelCode) {
        this.levelCode = levelCode;
    }

    public int getLevelCode() {
        return levelCode;
    }

    public JobLevel nextLevel(){
        JobLevel[] jobLevels = JobLevel.values();
        int nextIndex = this.ordinal()+1;
        if(nextIndex >= jobLevels.length)
            return this;
        return jobLevels[nextIndex];
    }

    @Override
    public String toString() {
        return name() + " (code=" + levelCode + ")";
    }

}
