package com.gsdyx.otakuhappy.pojo;

import java.util.ArrayList;
import java.util.List;

public class CartoonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CartoonExample() {
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

        public Criteria andCartoonidIsNull() {
            addCriterion("cartoonId is null");
            return (Criteria) this;
        }

        public Criteria andCartoonidIsNotNull() {
            addCriterion("cartoonId is not null");
            return (Criteria) this;
        }

        public Criteria andCartoonidEqualTo(Integer value) {
            addCriterion("cartoonId =", value, "cartoonid");
            return (Criteria) this;
        }

        public Criteria andCartoonidNotEqualTo(Integer value) {
            addCriterion("cartoonId <>", value, "cartoonid");
            return (Criteria) this;
        }

        public Criteria andCartoonidGreaterThan(Integer value) {
            addCriterion("cartoonId >", value, "cartoonid");
            return (Criteria) this;
        }

        public Criteria andCartoonidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cartoonId >=", value, "cartoonid");
            return (Criteria) this;
        }

        public Criteria andCartoonidLessThan(Integer value) {
            addCriterion("cartoonId <", value, "cartoonid");
            return (Criteria) this;
        }

        public Criteria andCartoonidLessThanOrEqualTo(Integer value) {
            addCriterion("cartoonId <=", value, "cartoonid");
            return (Criteria) this;
        }

        public Criteria andCartoonidIn(List<Integer> values) {
            addCriterion("cartoonId in", values, "cartoonid");
            return (Criteria) this;
        }

        public Criteria andCartoonidNotIn(List<Integer> values) {
            addCriterion("cartoonId not in", values, "cartoonid");
            return (Criteria) this;
        }

        public Criteria andCartoonidBetween(Integer value1, Integer value2) {
            addCriterion("cartoonId between", value1, value2, "cartoonid");
            return (Criteria) this;
        }

        public Criteria andCartoonidNotBetween(Integer value1, Integer value2) {
            addCriterion("cartoonId not between", value1, value2, "cartoonid");
            return (Criteria) this;
        }

        public Criteria andCartoonnameIsNull() {
            addCriterion("cartoonName is null");
            return (Criteria) this;
        }

        public Criteria andCartoonnameIsNotNull() {
            addCriterion("cartoonName is not null");
            return (Criteria) this;
        }

        public Criteria andCartoonnameEqualTo(String value) {
            addCriterion("cartoonName =", value, "cartoonname");
            return (Criteria) this;
        }

        public Criteria andCartoonnameNotEqualTo(String value) {
            addCriterion("cartoonName <>", value, "cartoonname");
            return (Criteria) this;
        }

        public Criteria andCartoonnameGreaterThan(String value) {
            addCriterion("cartoonName >", value, "cartoonname");
            return (Criteria) this;
        }

        public Criteria andCartoonnameGreaterThanOrEqualTo(String value) {
            addCriterion("cartoonName >=", value, "cartoonname");
            return (Criteria) this;
        }

        public Criteria andCartoonnameLessThan(String value) {
            addCriterion("cartoonName <", value, "cartoonname");
            return (Criteria) this;
        }

        public Criteria andCartoonnameLessThanOrEqualTo(String value) {
            addCriterion("cartoonName <=", value, "cartoonname");
            return (Criteria) this;
        }

        public Criteria andCartoonnameLike(String value) {
            addCriterion("cartoonName like", value, "cartoonname");
            return (Criteria) this;
        }

        public Criteria andCartoonnameNotLike(String value) {
            addCriterion("cartoonName not like", value, "cartoonname");
            return (Criteria) this;
        }

        public Criteria andCartoonnameIn(List<String> values) {
            addCriterion("cartoonName in", values, "cartoonname");
            return (Criteria) this;
        }

        public Criteria andCartoonnameNotIn(List<String> values) {
            addCriterion("cartoonName not in", values, "cartoonname");
            return (Criteria) this;
        }

        public Criteria andCartoonnameBetween(String value1, String value2) {
            addCriterion("cartoonName between", value1, value2, "cartoonname");
            return (Criteria) this;
        }

        public Criteria andCartoonnameNotBetween(String value1, String value2) {
            addCriterion("cartoonName not between", value1, value2, "cartoonname");
            return (Criteria) this;
        }

        public Criteria andEpisodesIsNull() {
            addCriterion("episodes is null");
            return (Criteria) this;
        }

        public Criteria andEpisodesIsNotNull() {
            addCriterion("episodes is not null");
            return (Criteria) this;
        }

        public Criteria andEpisodesEqualTo(String value) {
            addCriterion("episodes =", value, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesNotEqualTo(String value) {
            addCriterion("episodes <>", value, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesGreaterThan(String value) {
            addCriterion("episodes >", value, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesGreaterThanOrEqualTo(String value) {
            addCriterion("episodes >=", value, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesLessThan(String value) {
            addCriterion("episodes <", value, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesLessThanOrEqualTo(String value) {
            addCriterion("episodes <=", value, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesLike(String value) {
            addCriterion("episodes like", value, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesNotLike(String value) {
            addCriterion("episodes not like", value, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesIn(List<String> values) {
            addCriterion("episodes in", values, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesNotIn(List<String> values) {
            addCriterion("episodes not in", values, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesBetween(String value1, String value2) {
            addCriterion("episodes between", value1, value2, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesNotBetween(String value1, String value2) {
            addCriterion("episodes not between", value1, value2, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesallIsNull() {
            addCriterion("episodesAll is null");
            return (Criteria) this;
        }

        public Criteria andEpisodesallIsNotNull() {
            addCriterion("episodesAll is not null");
            return (Criteria) this;
        }

        public Criteria andEpisodesallEqualTo(String value) {
            addCriterion("episodesAll =", value, "episodesall");
            return (Criteria) this;
        }

        public Criteria andEpisodesallNotEqualTo(String value) {
            addCriterion("episodesAll <>", value, "episodesall");
            return (Criteria) this;
        }

        public Criteria andEpisodesallGreaterThan(String value) {
            addCriterion("episodesAll >", value, "episodesall");
            return (Criteria) this;
        }

        public Criteria andEpisodesallGreaterThanOrEqualTo(String value) {
            addCriterion("episodesAll >=", value, "episodesall");
            return (Criteria) this;
        }

        public Criteria andEpisodesallLessThan(String value) {
            addCriterion("episodesAll <", value, "episodesall");
            return (Criteria) this;
        }

        public Criteria andEpisodesallLessThanOrEqualTo(String value) {
            addCriterion("episodesAll <=", value, "episodesall");
            return (Criteria) this;
        }

        public Criteria andEpisodesallLike(String value) {
            addCriterion("episodesAll like", value, "episodesall");
            return (Criteria) this;
        }

        public Criteria andEpisodesallNotLike(String value) {
            addCriterion("episodesAll not like", value, "episodesall");
            return (Criteria) this;
        }

        public Criteria andEpisodesallIn(List<String> values) {
            addCriterion("episodesAll in", values, "episodesall");
            return (Criteria) this;
        }

        public Criteria andEpisodesallNotIn(List<String> values) {
            addCriterion("episodesAll not in", values, "episodesall");
            return (Criteria) this;
        }

        public Criteria andEpisodesallBetween(String value1, String value2) {
            addCriterion("episodesAll between", value1, value2, "episodesall");
            return (Criteria) this;
        }

        public Criteria andEpisodesallNotBetween(String value1, String value2) {
            addCriterion("episodesAll not between", value1, value2, "episodesall");
            return (Criteria) this;
        }

        public Criteria andWeekplayIsNull() {
            addCriterion("weekPlay is null");
            return (Criteria) this;
        }

        public Criteria andWeekplayIsNotNull() {
            addCriterion("weekPlay is not null");
            return (Criteria) this;
        }

        public Criteria andWeekplayEqualTo(String value) {
            addCriterion("weekPlay =", value, "weekplay");
            return (Criteria) this;
        }

        public Criteria andWeekplayNotEqualTo(String value) {
            addCriterion("weekPlay <>", value, "weekplay");
            return (Criteria) this;
        }

        public Criteria andWeekplayGreaterThan(String value) {
            addCriterion("weekPlay >", value, "weekplay");
            return (Criteria) this;
        }

        public Criteria andWeekplayGreaterThanOrEqualTo(String value) {
            addCriterion("weekPlay >=", value, "weekplay");
            return (Criteria) this;
        }

        public Criteria andWeekplayLessThan(String value) {
            addCriterion("weekPlay <", value, "weekplay");
            return (Criteria) this;
        }

        public Criteria andWeekplayLessThanOrEqualTo(String value) {
            addCriterion("weekPlay <=", value, "weekplay");
            return (Criteria) this;
        }

        public Criteria andWeekplayLike(String value) {
            addCriterion("weekPlay like", value, "weekplay");
            return (Criteria) this;
        }

        public Criteria andWeekplayNotLike(String value) {
            addCriterion("weekPlay not like", value, "weekplay");
            return (Criteria) this;
        }

        public Criteria andWeekplayIn(List<String> values) {
            addCriterion("weekPlay in", values, "weekplay");
            return (Criteria) this;
        }

        public Criteria andWeekplayNotIn(List<String> values) {
            addCriterion("weekPlay not in", values, "weekplay");
            return (Criteria) this;
        }

        public Criteria andWeekplayBetween(String value1, String value2) {
            addCriterion("weekPlay between", value1, value2, "weekplay");
            return (Criteria) this;
        }

        public Criteria andWeekplayNotBetween(String value1, String value2) {
            addCriterion("weekPlay not between", value1, value2, "weekplay");
            return (Criteria) this;
        }

        public Criteria andTimeplayIsNull() {
            addCriterion("timePlay is null");
            return (Criteria) this;
        }

        public Criteria andTimeplayIsNotNull() {
            addCriterion("timePlay is not null");
            return (Criteria) this;
        }

        public Criteria andTimeplayEqualTo(String value) {
            addCriterion("timePlay =", value, "timeplay");
            return (Criteria) this;
        }

        public Criteria andTimeplayNotEqualTo(String value) {
            addCriterion("timePlay <>", value, "timeplay");
            return (Criteria) this;
        }

        public Criteria andTimeplayGreaterThan(String value) {
            addCriterion("timePlay >", value, "timeplay");
            return (Criteria) this;
        }

        public Criteria andTimeplayGreaterThanOrEqualTo(String value) {
            addCriterion("timePlay >=", value, "timeplay");
            return (Criteria) this;
        }

        public Criteria andTimeplayLessThan(String value) {
            addCriterion("timePlay <", value, "timeplay");
            return (Criteria) this;
        }

        public Criteria andTimeplayLessThanOrEqualTo(String value) {
            addCriterion("timePlay <=", value, "timeplay");
            return (Criteria) this;
        }

        public Criteria andTimeplayLike(String value) {
            addCriterion("timePlay like", value, "timeplay");
            return (Criteria) this;
        }

        public Criteria andTimeplayNotLike(String value) {
            addCriterion("timePlay not like", value, "timeplay");
            return (Criteria) this;
        }

        public Criteria andTimeplayIn(List<String> values) {
            addCriterion("timePlay in", values, "timeplay");
            return (Criteria) this;
        }

        public Criteria andTimeplayNotIn(List<String> values) {
            addCriterion("timePlay not in", values, "timeplay");
            return (Criteria) this;
        }

        public Criteria andTimeplayBetween(String value1, String value2) {
            addCriterion("timePlay between", value1, value2, "timeplay");
            return (Criteria) this;
        }

        public Criteria andTimeplayNotBetween(String value1, String value2) {
            addCriterion("timePlay not between", value1, value2, "timeplay");
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