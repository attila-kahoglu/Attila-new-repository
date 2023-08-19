package com.unitedcodernigar.io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class DeleteTest {
    public static void main(String[] args) {

        File delete = new File("doc","TestReport.xls2023-07-03-19-05-51-320");
        try {
            FileUtils.delete(delete);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
