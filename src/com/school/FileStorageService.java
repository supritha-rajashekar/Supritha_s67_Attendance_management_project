package com.school;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileStorageService {

    public void saveToFile(String fileName, List<? extends Storable> records) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Storable record : records) {
                writer.write(record.toStorageString());
                writer.newLine();
            }
            System.out.println("Saved " + records.size() + " records to " + fileName);
        } catch (IOException e) {
            System.out.println("Error while saving to file " + fileName + ": " + e.getMessage());
        }
    }
}
