public class R06_MET01_J {
    public static void main(String[] args) {
        try {
            System.out.println("Result: " + getAbsAdd(Integer.MIN_VALUE, 1));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static int getAbsAddNonCompliant(int x, int y) {
        assert x != Integer.MIN_VALUE;
        assert y != Integer.MIN_VALUE;
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        assert absX <= Integer.MAX_VALUE - absY;
        return absX + absY;
    }

    public static int getAbsAdd(int x, int y) {
        if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Arguments can't be Integer.MIN_VALUE");
        }

        int absX = Math.abs(x);
        int absY = Math.abs(y);

        if (absX > Integer.MAX_VALUE - absY) {
            throw new IllegalArgumentException("Integer overflow occurred");
        }

        return absX + absY;
    }
}
