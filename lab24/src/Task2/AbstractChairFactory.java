package Task2;

// Интерфейс абстрактной фабрики стульев
public interface AbstractChairFactory {
    VictorianChair createVictorianChair();
    MagicChair createMagicChair();
    FunctionalChair createFunctionalChair();
}

