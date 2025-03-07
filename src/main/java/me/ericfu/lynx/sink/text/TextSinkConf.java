package me.ericfu.lynx.sink.text;

import lombok.Data;
import me.ericfu.lynx.model.conf.SinkConf;

import javax.validation.constraints.NotEmpty;

@Data
public class TextSinkConf implements SinkConf {

    /**
     * a directory to save the exported data
     */
    @NotEmpty
    private String path;

    /**
     * column separator
     */
    @NotEmpty
    private String separator = ",";

    /**
     * output file encoding
     */
    @NotEmpty
    private String encoding = "utf-8"; // TODO: add validator
}
