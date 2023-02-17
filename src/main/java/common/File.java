package common;

public class File {
    final String path;
    final String name;

    public File(String path, String name) {
        this.path = path;
        this.name = name;
    }


    public static File of(String path, String name){
        return new File(path, name);
    }


    public String getPath() {
        return path;
    }

    public String getName() {
        return name;
    }
}
