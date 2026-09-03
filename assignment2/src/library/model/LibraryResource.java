package library.model;

public abstract class LibraryResource {
    private int resourceId;
    private String title;
    private String author;
    protected static String libraryName = "Smart Library";
    private static int resourceCounter = 0;

    public LibraryResource(int resourceId, String title, String author) {
        this.resourceId = resourceId;
        this.title = title;
        this.author = author;
        resourceCounter++;
    }

    public int getResourceId() { return resourceId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public static int getTotalResources() { return resourceCounter; }

    public abstract double calculateFine(int overdueDays);
}
