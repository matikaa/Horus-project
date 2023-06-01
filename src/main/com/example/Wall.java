package main.com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class Wall implements Structure {
    private CompositeBlock compositeBlocks;

    @Override
    public Optional<Block> findBlockByColor(String color) {
        return compositeBlocks.getBlocks().stream()
                .filter(block -> block.getColor().equals(color))
                .findFirst();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return compositeBlocks.getBlocks().stream()
                .filter(block -> block.getMaterial().equals(material))
                .collect(toList());
    }

    @Override
    public int count() {
        return compositeBlocks.getBlocks().size();
    }
}
