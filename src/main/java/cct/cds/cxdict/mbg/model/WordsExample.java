package cct.cds.cxdict.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WordsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWordIsNull() {
            addCriterion("word is null");
            return (Criteria) this;
        }

        public Criteria andWordIsNotNull() {
            addCriterion("word is not null");
            return (Criteria) this;
        }

        public Criteria andWordEqualTo(String value) {
            addCriterion("word =", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotEqualTo(String value) {
            addCriterion("word <>", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordGreaterThan(String value) {
            addCriterion("word >", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordGreaterThanOrEqualTo(String value) {
            addCriterion("word >=", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLessThan(String value) {
            addCriterion("word <", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLessThanOrEqualTo(String value) {
            addCriterion("word <=", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordLike(String value) {
            addCriterion("word like", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotLike(String value) {
            addCriterion("word not like", value, "word");
            return (Criteria) this;
        }

        public Criteria andWordIn(List<String> values) {
            addCriterion("word in", values, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotIn(List<String> values) {
            addCriterion("word not in", values, "word");
            return (Criteria) this;
        }

        public Criteria andWordBetween(String value1, String value2) {
            addCriterion("word between", value1, value2, "word");
            return (Criteria) this;
        }

        public Criteria andWordNotBetween(String value1, String value2) {
            addCriterion("word not between", value1, value2, "word");
            return (Criteria) this;
        }

        public Criteria andParaphraseIsNull() {
            addCriterion("paraphrase is null");
            return (Criteria) this;
        }

        public Criteria andParaphraseIsNotNull() {
            addCriterion("paraphrase is not null");
            return (Criteria) this;
        }

        public Criteria andParaphraseEqualTo(String value) {
            addCriterion("paraphrase =", value, "paraphrase");
            return (Criteria) this;
        }

        public Criteria andParaphraseNotEqualTo(String value) {
            addCriterion("paraphrase <>", value, "paraphrase");
            return (Criteria) this;
        }

        public Criteria andParaphraseGreaterThan(String value) {
            addCriterion("paraphrase >", value, "paraphrase");
            return (Criteria) this;
        }

        public Criteria andParaphraseGreaterThanOrEqualTo(String value) {
            addCriterion("paraphrase >=", value, "paraphrase");
            return (Criteria) this;
        }

        public Criteria andParaphraseLessThan(String value) {
            addCriterion("paraphrase <", value, "paraphrase");
            return (Criteria) this;
        }

        public Criteria andParaphraseLessThanOrEqualTo(String value) {
            addCriterion("paraphrase <=", value, "paraphrase");
            return (Criteria) this;
        }

        public Criteria andParaphraseLike(String value) {
            addCriterion("paraphrase like", value, "paraphrase");
            return (Criteria) this;
        }

        public Criteria andParaphraseNotLike(String value) {
            addCriterion("paraphrase not like", value, "paraphrase");
            return (Criteria) this;
        }

        public Criteria andParaphraseIn(List<String> values) {
            addCriterion("paraphrase in", values, "paraphrase");
            return (Criteria) this;
        }

        public Criteria andParaphraseNotIn(List<String> values) {
            addCriterion("paraphrase not in", values, "paraphrase");
            return (Criteria) this;
        }

        public Criteria andParaphraseBetween(String value1, String value2) {
            addCriterion("paraphrase between", value1, value2, "paraphrase");
            return (Criteria) this;
        }

        public Criteria andParaphraseNotBetween(String value1, String value2) {
            addCriterion("paraphrase not between", value1, value2, "paraphrase");
            return (Criteria) this;
        }

        public Criteria andFivestarIsNull() {
            addCriterion("fiveStar is null");
            return (Criteria) this;
        }

        public Criteria andFivestarIsNotNull() {
            addCriterion("fiveStar is not null");
            return (Criteria) this;
        }

        public Criteria andFivestarEqualTo(Boolean value) {
            addCriterion("fiveStar =", value, "fivestar");
            return (Criteria) this;
        }

        public Criteria andFivestarNotEqualTo(Boolean value) {
            addCriterion("fiveStar <>", value, "fivestar");
            return (Criteria) this;
        }

        public Criteria andFivestarGreaterThan(Boolean value) {
            addCriterion("fiveStar >", value, "fivestar");
            return (Criteria) this;
        }

        public Criteria andFivestarGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fiveStar >=", value, "fivestar");
            return (Criteria) this;
        }

        public Criteria andFivestarLessThan(Boolean value) {
            addCriterion("fiveStar <", value, "fivestar");
            return (Criteria) this;
        }

        public Criteria andFivestarLessThanOrEqualTo(Boolean value) {
            addCriterion("fiveStar <=", value, "fivestar");
            return (Criteria) this;
        }

        public Criteria andFivestarIn(List<Boolean> values) {
            addCriterion("fiveStar in", values, "fivestar");
            return (Criteria) this;
        }

        public Criteria andFivestarNotIn(List<Boolean> values) {
            addCriterion("fiveStar not in", values, "fivestar");
            return (Criteria) this;
        }

        public Criteria andFivestarBetween(Boolean value1, Boolean value2) {
            addCriterion("fiveStar between", value1, value2, "fivestar");
            return (Criteria) this;
        }

        public Criteria andFivestarNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fiveStar not between", value1, value2, "fivestar");
            return (Criteria) this;
        }

        public Criteria andBreadIsNull() {
            addCriterion("bRead is null");
            return (Criteria) this;
        }

        public Criteria andBreadIsNotNull() {
            addCriterion("bRead is not null");
            return (Criteria) this;
        }

        public Criteria andBreadEqualTo(Boolean value) {
            addCriterion("bRead =", value, "bread");
            return (Criteria) this;
        }

        public Criteria andBreadNotEqualTo(Boolean value) {
            addCriterion("bRead <>", value, "bread");
            return (Criteria) this;
        }

        public Criteria andBreadGreaterThan(Boolean value) {
            addCriterion("bRead >", value, "bread");
            return (Criteria) this;
        }

        public Criteria andBreadGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bRead >=", value, "bread");
            return (Criteria) this;
        }

        public Criteria andBreadLessThan(Boolean value) {
            addCriterion("bRead <", value, "bread");
            return (Criteria) this;
        }

        public Criteria andBreadLessThanOrEqualTo(Boolean value) {
            addCriterion("bRead <=", value, "bread");
            return (Criteria) this;
        }

        public Criteria andBreadIn(List<Boolean> values) {
            addCriterion("bRead in", values, "bread");
            return (Criteria) this;
        }

        public Criteria andBreadNotIn(List<Boolean> values) {
            addCriterion("bRead not in", values, "bread");
            return (Criteria) this;
        }

        public Criteria andBreadBetween(Boolean value1, Boolean value2) {
            addCriterion("bRead between", value1, value2, "bread");
            return (Criteria) this;
        }

        public Criteria andBreadNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bRead not between", value1, value2, "bread");
            return (Criteria) this;
        }

        public Criteria andSentencesIsNull() {
            addCriterion("sentences is null");
            return (Criteria) this;
        }

        public Criteria andSentencesIsNotNull() {
            addCriterion("sentences is not null");
            return (Criteria) this;
        }

        public Criteria andSentencesEqualTo(String value) {
            addCriterion("sentences =", value, "sentences");
            return (Criteria) this;
        }

        public Criteria andSentencesNotEqualTo(String value) {
            addCriterion("sentences <>", value, "sentences");
            return (Criteria) this;
        }

        public Criteria andSentencesGreaterThan(String value) {
            addCriterion("sentences >", value, "sentences");
            return (Criteria) this;
        }

        public Criteria andSentencesGreaterThanOrEqualTo(String value) {
            addCriterion("sentences >=", value, "sentences");
            return (Criteria) this;
        }

        public Criteria andSentencesLessThan(String value) {
            addCriterion("sentences <", value, "sentences");
            return (Criteria) this;
        }

        public Criteria andSentencesLessThanOrEqualTo(String value) {
            addCriterion("sentences <=", value, "sentences");
            return (Criteria) this;
        }

        public Criteria andSentencesLike(String value) {
            addCriterion("sentences like", value, "sentences");
            return (Criteria) this;
        }

        public Criteria andSentencesNotLike(String value) {
            addCriterion("sentences not like", value, "sentences");
            return (Criteria) this;
        }

        public Criteria andSentencesIn(List<String> values) {
            addCriterion("sentences in", values, "sentences");
            return (Criteria) this;
        }

        public Criteria andSentencesNotIn(List<String> values) {
            addCriterion("sentences not in", values, "sentences");
            return (Criteria) this;
        }

        public Criteria andSentencesBetween(String value1, String value2) {
            addCriterion("sentences between", value1, value2, "sentences");
            return (Criteria) this;
        }

        public Criteria andSentencesNotBetween(String value1, String value2) {
            addCriterion("sentences not between", value1, value2, "sentences");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIsNull() {
            addCriterion("modifiedTime is null");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIsNotNull() {
            addCriterion("modifiedTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeEqualTo(String value) {
            addCriterion("modifiedTime =", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotEqualTo(String value) {
            addCriterion("modifiedTime <>", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeGreaterThan(String value) {
            addCriterion("modifiedTime >", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeGreaterThanOrEqualTo(String value) {
            addCriterion("modifiedTime >=", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLessThan(String value) {
            addCriterion("modifiedTime <", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLessThanOrEqualTo(String value) {
            addCriterion("modifiedTime <=", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLike(String value) {
            addCriterion("modifiedTime like", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotLike(String value) {
            addCriterion("modifiedTime not like", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIn(List<String> values) {
            addCriterion("modifiedTime in", values, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotIn(List<String> values) {
            addCriterion("modifiedTime not in", values, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeBetween(String value1, String value2) {
            addCriterion("modifiedTime between", value1, value2, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotBetween(String value1, String value2) {
            addCriterion("modifiedTime not between", value1, value2, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andSynonymsIsNull() {
            addCriterion("synonyms is null");
            return (Criteria) this;
        }

        public Criteria andSynonymsIsNotNull() {
            addCriterion("synonyms is not null");
            return (Criteria) this;
        }

        public Criteria andSynonymsEqualTo(String value) {
            addCriterion("synonyms =", value, "synonyms");
            return (Criteria) this;
        }

        public Criteria andSynonymsNotEqualTo(String value) {
            addCriterion("synonyms <>", value, "synonyms");
            return (Criteria) this;
        }

        public Criteria andSynonymsGreaterThan(String value) {
            addCriterion("synonyms >", value, "synonyms");
            return (Criteria) this;
        }

        public Criteria andSynonymsGreaterThanOrEqualTo(String value) {
            addCriterion("synonyms >=", value, "synonyms");
            return (Criteria) this;
        }

        public Criteria andSynonymsLessThan(String value) {
            addCriterion("synonyms <", value, "synonyms");
            return (Criteria) this;
        }

        public Criteria andSynonymsLessThanOrEqualTo(String value) {
            addCriterion("synonyms <=", value, "synonyms");
            return (Criteria) this;
        }

        public Criteria andSynonymsLike(String value) {
            addCriterion("synonyms like", value, "synonyms");
            return (Criteria) this;
        }

        public Criteria andSynonymsNotLike(String value) {
            addCriterion("synonyms not like", value, "synonyms");
            return (Criteria) this;
        }

        public Criteria andSynonymsIn(List<String> values) {
            addCriterion("synonyms in", values, "synonyms");
            return (Criteria) this;
        }

        public Criteria andSynonymsNotIn(List<String> values) {
            addCriterion("synonyms not in", values, "synonyms");
            return (Criteria) this;
        }

        public Criteria andSynonymsBetween(String value1, String value2) {
            addCriterion("synonyms between", value1, value2, "synonyms");
            return (Criteria) this;
        }

        public Criteria andSynonymsNotBetween(String value1, String value2) {
            addCriterion("synonyms not between", value1, value2, "synonyms");
            return (Criteria) this;
        }

        public Criteria andOppositesIsNull() {
            addCriterion("opposites is null");
            return (Criteria) this;
        }

        public Criteria andOppositesIsNotNull() {
            addCriterion("opposites is not null");
            return (Criteria) this;
        }

        public Criteria andOppositesEqualTo(String value) {
            addCriterion("opposites =", value, "opposites");
            return (Criteria) this;
        }

        public Criteria andOppositesNotEqualTo(String value) {
            addCriterion("opposites <>", value, "opposites");
            return (Criteria) this;
        }

        public Criteria andOppositesGreaterThan(String value) {
            addCriterion("opposites >", value, "opposites");
            return (Criteria) this;
        }

        public Criteria andOppositesGreaterThanOrEqualTo(String value) {
            addCriterion("opposites >=", value, "opposites");
            return (Criteria) this;
        }

        public Criteria andOppositesLessThan(String value) {
            addCriterion("opposites <", value, "opposites");
            return (Criteria) this;
        }

        public Criteria andOppositesLessThanOrEqualTo(String value) {
            addCriterion("opposites <=", value, "opposites");
            return (Criteria) this;
        }

        public Criteria andOppositesLike(String value) {
            addCriterion("opposites like", value, "opposites");
            return (Criteria) this;
        }

        public Criteria andOppositesNotLike(String value) {
            addCriterion("opposites not like", value, "opposites");
            return (Criteria) this;
        }

        public Criteria andOppositesIn(List<String> values) {
            addCriterion("opposites in", values, "opposites");
            return (Criteria) this;
        }

        public Criteria andOppositesNotIn(List<String> values) {
            addCriterion("opposites not in", values, "opposites");
            return (Criteria) this;
        }

        public Criteria andOppositesBetween(String value1, String value2) {
            addCriterion("opposites between", value1, value2, "opposites");
            return (Criteria) this;
        }

        public Criteria andOppositesNotBetween(String value1, String value2) {
            addCriterion("opposites not between", value1, value2, "opposites");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNull() {
            addCriterion("frequency is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNotNull() {
            addCriterion("frequency is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyEqualTo(Integer value) {
            addCriterion("frequency =", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotEqualTo(Integer value) {
            addCriterion("frequency <>", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThan(Integer value) {
            addCriterion("frequency >", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("frequency >=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThan(Integer value) {
            addCriterion("frequency <", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThanOrEqualTo(Integer value) {
            addCriterion("frequency <=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyIn(List<Integer> values) {
            addCriterion("frequency in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotIn(List<Integer> values) {
            addCriterion("frequency not in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyBetween(Integer value1, Integer value2) {
            addCriterion("frequency between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotBetween(Integer value1, Integer value2) {
            addCriterion("frequency not between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andPracticedIsNull() {
            addCriterion("practiced is null");
            return (Criteria) this;
        }

        public Criteria andPracticedIsNotNull() {
            addCriterion("practiced is not null");
            return (Criteria) this;
        }

        public Criteria andPracticedEqualTo(Integer value) {
            addCriterion("practiced =", value, "practiced");
            return (Criteria) this;
        }

        public Criteria andPracticedNotEqualTo(Integer value) {
            addCriterion("practiced <>", value, "practiced");
            return (Criteria) this;
        }

        public Criteria andPracticedGreaterThan(Integer value) {
            addCriterion("practiced >", value, "practiced");
            return (Criteria) this;
        }

        public Criteria andPracticedGreaterThanOrEqualTo(Integer value) {
            addCriterion("practiced >=", value, "practiced");
            return (Criteria) this;
        }

        public Criteria andPracticedLessThan(Integer value) {
            addCriterion("practiced <", value, "practiced");
            return (Criteria) this;
        }

        public Criteria andPracticedLessThanOrEqualTo(Integer value) {
            addCriterion("practiced <=", value, "practiced");
            return (Criteria) this;
        }

        public Criteria andPracticedIn(List<Integer> values) {
            addCriterion("practiced in", values, "practiced");
            return (Criteria) this;
        }

        public Criteria andPracticedNotIn(List<Integer> values) {
            addCriterion("practiced not in", values, "practiced");
            return (Criteria) this;
        }

        public Criteria andPracticedBetween(Integer value1, Integer value2) {
            addCriterion("practiced between", value1, value2, "practiced");
            return (Criteria) this;
        }

        public Criteria andPracticedNotBetween(Integer value1, Integer value2) {
            addCriterion("practiced not between", value1, value2, "practiced");
            return (Criteria) this;
        }

        public Criteria andErrorrateIsNull() {
            addCriterion("errorrate is null");
            return (Criteria) this;
        }

        public Criteria andErrorrateIsNotNull() {
            addCriterion("errorrate is not null");
            return (Criteria) this;
        }

        public Criteria andErrorrateEqualTo(Integer value) {
            addCriterion("errorrate =", value, "errorrate");
            return (Criteria) this;
        }

        public Criteria andErrorrateNotEqualTo(Integer value) {
            addCriterion("errorrate <>", value, "errorrate");
            return (Criteria) this;
        }

        public Criteria andErrorrateGreaterThan(Integer value) {
            addCriterion("errorrate >", value, "errorrate");
            return (Criteria) this;
        }

        public Criteria andErrorrateGreaterThanOrEqualTo(Integer value) {
            addCriterion("errorrate >=", value, "errorrate");
            return (Criteria) this;
        }

        public Criteria andErrorrateLessThan(Integer value) {
            addCriterion("errorrate <", value, "errorrate");
            return (Criteria) this;
        }

        public Criteria andErrorrateLessThanOrEqualTo(Integer value) {
            addCriterion("errorrate <=", value, "errorrate");
            return (Criteria) this;
        }

        public Criteria andErrorrateIn(List<Integer> values) {
            addCriterion("errorrate in", values, "errorrate");
            return (Criteria) this;
        }

        public Criteria andErrorrateNotIn(List<Integer> values) {
            addCriterion("errorrate not in", values, "errorrate");
            return (Criteria) this;
        }

        public Criteria andErrorrateBetween(Integer value1, Integer value2) {
            addCriterion("errorrate between", value1, value2, "errorrate");
            return (Criteria) this;
        }

        public Criteria andErrorrateNotBetween(Integer value1, Integer value2) {
            addCriterion("errorrate not between", value1, value2, "errorrate");
            return (Criteria) this;
        }

        public Criteria andWordfrequencyIsNull() {
            addCriterion("wordFrequency is null");
            return (Criteria) this;
        }

        public Criteria andWordfrequencyIsNotNull() {
            addCriterion("wordFrequency is not null");
            return (Criteria) this;
        }

        public Criteria andWordfrequencyEqualTo(Integer value) {
            addCriterion("wordFrequency =", value, "wordfrequency");
            return (Criteria) this;
        }

        public Criteria andWordfrequencyNotEqualTo(Integer value) {
            addCriterion("wordFrequency <>", value, "wordfrequency");
            return (Criteria) this;
        }

        public Criteria andWordfrequencyGreaterThan(Integer value) {
            addCriterion("wordFrequency >", value, "wordfrequency");
            return (Criteria) this;
        }

        public Criteria andWordfrequencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("wordFrequency >=", value, "wordfrequency");
            return (Criteria) this;
        }

        public Criteria andWordfrequencyLessThan(Integer value) {
            addCriterion("wordFrequency <", value, "wordfrequency");
            return (Criteria) this;
        }

        public Criteria andWordfrequencyLessThanOrEqualTo(Integer value) {
            addCriterion("wordFrequency <=", value, "wordfrequency");
            return (Criteria) this;
        }

        public Criteria andWordfrequencyIn(List<Integer> values) {
            addCriterion("wordFrequency in", values, "wordfrequency");
            return (Criteria) this;
        }

        public Criteria andWordfrequencyNotIn(List<Integer> values) {
            addCriterion("wordFrequency not in", values, "wordfrequency");
            return (Criteria) this;
        }

        public Criteria andWordfrequencyBetween(Integer value1, Integer value2) {
            addCriterion("wordFrequency between", value1, value2, "wordfrequency");
            return (Criteria) this;
        }

        public Criteria andWordfrequencyNotBetween(Integer value1, Integer value2) {
            addCriterion("wordFrequency not between", value1, value2, "wordfrequency");
            return (Criteria) this;
        }

        public Criteria andRighttimesIsNull() {
            addCriterion("righttimes is null");
            return (Criteria) this;
        }

        public Criteria andRighttimesIsNotNull() {
            addCriterion("righttimes is not null");
            return (Criteria) this;
        }

        public Criteria andRighttimesEqualTo(Integer value) {
            addCriterion("righttimes =", value, "righttimes");
            return (Criteria) this;
        }

        public Criteria andRighttimesNotEqualTo(Integer value) {
            addCriterion("righttimes <>", value, "righttimes");
            return (Criteria) this;
        }

        public Criteria andRighttimesGreaterThan(Integer value) {
            addCriterion("righttimes >", value, "righttimes");
            return (Criteria) this;
        }

        public Criteria andRighttimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("righttimes >=", value, "righttimes");
            return (Criteria) this;
        }

        public Criteria andRighttimesLessThan(Integer value) {
            addCriterion("righttimes <", value, "righttimes");
            return (Criteria) this;
        }

        public Criteria andRighttimesLessThanOrEqualTo(Integer value) {
            addCriterion("righttimes <=", value, "righttimes");
            return (Criteria) this;
        }

        public Criteria andRighttimesIn(List<Integer> values) {
            addCriterion("righttimes in", values, "righttimes");
            return (Criteria) this;
        }

        public Criteria andRighttimesNotIn(List<Integer> values) {
            addCriterion("righttimes not in", values, "righttimes");
            return (Criteria) this;
        }

        public Criteria andRighttimesBetween(Integer value1, Integer value2) {
            addCriterion("righttimes between", value1, value2, "righttimes");
            return (Criteria) this;
        }

        public Criteria andRighttimesNotBetween(Integer value1, Integer value2) {
            addCriterion("righttimes not between", value1, value2, "righttimes");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}