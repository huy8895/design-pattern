package composite.example;

public class FileLeaf implements FileComponent{
    private String fileName;
    private long size;

    public FileLeaf(String fileName, long size) {
        this.fileName = fileName;
        this.size = size;
    }

    @Override
    public void showProperties() {
        System.out.println("FileLeaf [name=" + fileName + ", size=" + size + "]");
    }

    @Override
    public long totalSize() {
        return size;
    }
}
