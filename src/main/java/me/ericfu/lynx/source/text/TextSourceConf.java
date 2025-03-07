package me.ericfu.lynx.source.text;

import lombok.Data;
import me.ericfu.lynx.model.conf.SourceConf;

import javax.validation.constraints.NotEmpty;

@Data
public class TextSourceConf implements SourceConf {

    /**
     * path to the directory or file
     */
    @NotEmpty
    private String path;

    /**
     * column separator
     */
    @NotEmpty
    private String separator = ",";

    /**
     * input file encoding
     */
    @NotEmpty
    private String encoding = "utf-8";
}
