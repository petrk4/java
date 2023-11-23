package Task3;

// Интерфейс для фабрики документов
public interface ICreateDocument {
    IDocument createNew();
    IDocument createOpen();
}

