public class Software {
    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    public Software(String programmer, String platform, String os) {
        this.programmer = programmer;
        this.platform = platform;
        this.os = os;
    }

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
    @Override
    public String toString() {
        return "Programmer:   " + getProgrammer() + "\n" + "Platform:  " + getProgrammer()+ "\n" +
                "Os:    " + getOs()+ "\n";
    }
}
