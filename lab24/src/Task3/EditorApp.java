package Task3;

// Основной класс приложения
public class EditorApp {
    private IDocument document;
    private ICreateDocument documentFactory;

    public EditorApp(ICreateDocument documentFactory) {
        this.documentFactory = documentFactory;
        this.document = null;
    }

    public void createNewDocument() {
        document = documentFactory.createNew();
        document.open();
    }

    public void openDocument() {
        document = documentFactory.createOpen();
        document.open();
    }

    public void saveDocument() {
        if (document != null) {
            document.save();
        } else {
            System.out.println("No document open to save.");
        }
    }

    public static void main(String[] args) {
        // Пример использования каркаса для текстового редактора
        EditorApp textEditor = new EditorApp(new CreateTextDocument());

        textEditor.createNewDocument();
        textEditor.saveDocument();

        textEditor.openDocument();
        textEditor.saveDocument();
    }
}

