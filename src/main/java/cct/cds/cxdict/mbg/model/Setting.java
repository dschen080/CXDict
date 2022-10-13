package cct.cds.cxdict.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Setting implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "学习者名称")
    private String username;

    @ApiModelProperty(value = "外语名称，比如英语；日语；法语；...")
    private String wordsname;

    @ApiModelProperty(value = "外语言类型，0-英语；1-日语;2-法语；3-德语；...")
    private Byte wordstype;

    @ApiModelProperty(value = "语言等级描述，比如英语四级；英语六级；法语四级；...")
    private String level;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWordsname() {
        return wordsname;
    }

    public void setWordsname(String wordsname) {
        this.wordsname = wordsname;
    }

    public Byte getWordstype() {
        return wordstype;
    }

    public void setWordstype(Byte wordstype) {
        this.wordstype = wordstype;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", wordsname=").append(wordsname);
        sb.append(", wordstype=").append(wordstype);
        sb.append(", level=").append(level);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}