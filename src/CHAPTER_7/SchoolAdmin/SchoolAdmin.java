package CHAPTER_7.SchoolAdmin;

public class SchoolAdmin {
    private int[][] nativeScores = new int[5][5];

    public SchoolAdmin() {}  // no args
    public SchoolAdmin(int score[][]) {

    }

    public int[][] getNativeScores() {
        return nativeScores;
    }

    public void setNativeScores(int[][] nativeScores) {
        this.nativeScores = nativeScores;
    }

    public void calculateAverage() {
        int totalScore = 0;
        for (int i = 0; i < nativeScores.length; i++) {
            for (int j = 0; j < nativeScores[i].length; j++) {
                totalScore += nativeScores[i][j];
            }
        }
    }
}
