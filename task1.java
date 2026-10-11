public class task1 {

    private int hour;
    private int minute;
    private int second;

    public task1() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public task1(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public task1(int totalSeconds) {
        hour = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        minute = remainingSeconds / 60;
        second = remainingSeconds % 60;
    }

    public int elapsedSeconds(task1 other) {

        int thisTotalSeconds =
                hour * 3600 + minute * 60 + second;

        int otherTotalSeconds =
                other.hour * 3600 + other.minute * 60 + other.second;

        return Math.abs(thisTotalSeconds - otherTotalSeconds);
    }

    public task1 timeElapsedFormatted(task1 other) {
        int diffSeconds = elapsedSeconds(other);
        return new task1(diffSeconds);
    }

    public void display() {
        System.out.printf("%02d:%02d:%02d%n",
                hour, minute, second);
    }

    public static void main(String[] args) {

        task1 t1 = new task1(10, 30, 20);
        task1 t2 = new task1(12, 45, 50);

        t1.display();
        t2.display();

        System.out.println("Elapsed seconds: "
                + t1.elapsedSeconds(t2));

        task1 result = t1.timeElapsedFormatted(t2);

        System.out.println("Elapsed time:");
        result.display();
    }
}