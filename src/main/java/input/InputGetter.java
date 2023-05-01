package input;

import lombok.Getter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputGetter {
    private final File file;
    private final List<String> lines;

    public InputGetter(String path) throws IOException {
        this.file = new File(path);
        this.lines = new ArrayList<>();
    }

    public List<String> getFileLines() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        while (br.ready()){
            lines.add(br.readLine());
        }
        return lines;
    }
}
