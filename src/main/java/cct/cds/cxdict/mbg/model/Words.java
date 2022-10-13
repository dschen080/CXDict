package cct.cds.cxdict.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Words implements Serializable {
    @ApiModelProperty(value = "单词id")
    private Integer id;

    @ApiModelProperty(value = "单词名称")
    private String word;

    @ApiModelProperty(value = "单词释义")
    private String paraphrase;

    @ApiModelProperty(value = "五星级单词，0-一般单词")
    private Boolean fivestar;

    @ApiModelProperty(value = "单词已读，0-未读")
    private Boolean bread;

    @ApiModelProperty(value = "单词句子例子，多个句子用英语分号隔开")
    private String sentences;

    @ApiModelProperty(value = "单词更改时间,2022-09-09 18:01:01")
    private String modifiedtime;

    @ApiModelProperty(value = "同义词，英文分号隔开")
    private String synonyms;

    @ApiModelProperty(value = "反义词，英文分号隔开")
    private String opposites;

    @ApiModelProperty(value = "个人词频")
    private Integer frequency;

    @ApiModelProperty(value = "练习次数")
    private Integer practiced;

    @ApiModelProperty(value = "练习答错次数,可以计算错误率")
    private Integer errorrate;

    @ApiModelProperty(value = "单词本身词频")
    private Integer wordfrequency;

    @ApiModelProperty(value = "连续答对次数")
    private Integer righttimes;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getParaphrase() {
        return paraphrase;
    }

    public void setParaphrase(String paraphrase) {
        this.paraphrase = paraphrase;
    }

    public Boolean getFivestar() {
        return fivestar;
    }

    public void setFivestar(Boolean fivestar) {
        this.fivestar = fivestar;
    }

    public Boolean getBread() {
        return bread;
    }

    public void setBread(Boolean bread) {
        this.bread = bread;
    }

    public String getSentences() {
        return sentences;
    }

    public void setSentences(String sentences) {
        this.sentences = sentences;
    }

    public String getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(String modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public String getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(String synonyms) {
        this.synonyms = synonyms;
    }

    public String getOpposites() {
        return opposites;
    }

    public void setOpposites(String opposites) {
        this.opposites = opposites;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public Integer getPracticed() {
        return practiced;
    }

    public void setPracticed(Integer practiced) {
        this.practiced = practiced;
    }

    public Integer getErrorrate() {
        return errorrate;
    }

    public void setErrorrate(Integer errorrate) {
        this.errorrate = errorrate;
    }

    public Integer getWordfrequency() {
        return wordfrequency;
    }

    public void setWordfrequency(Integer wordfrequency) {
        this.wordfrequency = wordfrequency;
    }

    public Integer getRighttimes() {
        return righttimes;
    }

    public void setRighttimes(Integer righttimes) {
        this.righttimes = righttimes;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", word=").append(word);
        sb.append(", paraphrase=").append(paraphrase);
        sb.append(", fivestar=").append(fivestar);
        sb.append(", bread=").append(bread);
        sb.append(", sentences=").append(sentences);
        sb.append(", modifiedtime=").append(modifiedtime);
        sb.append(", synonyms=").append(synonyms);
        sb.append(", opposites=").append(opposites);
        sb.append(", frequency=").append(frequency);
        sb.append(", practiced=").append(practiced);
        sb.append(", errorrate=").append(errorrate);
        sb.append(", wordfrequency=").append(wordfrequency);
        sb.append(", righttimes=").append(righttimes);
        sb.append(", createtime=").append(createtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}