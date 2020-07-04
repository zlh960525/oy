package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andContactpersonIsNull() {
            addCriterion("Contactperson is null");
            return (Criteria) this;
        }

        public Criteria andContactpersonIsNotNull() {
            addCriterion("Contactperson is not null");
            return (Criteria) this;
        }

        public Criteria andContactpersonEqualTo(String value) {
            addCriterion("Contactperson =", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonNotEqualTo(String value) {
            addCriterion("Contactperson <>", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonGreaterThan(String value) {
            addCriterion("Contactperson >", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonGreaterThanOrEqualTo(String value) {
            addCriterion("Contactperson >=", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonLessThan(String value) {
            addCriterion("Contactperson <", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonLessThanOrEqualTo(String value) {
            addCriterion("Contactperson <=", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonLike(String value) {
            addCriterion("Contactperson like", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonNotLike(String value) {
            addCriterion("Contactperson not like", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonIn(List<String> values) {
            addCriterion("Contactperson in", values, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonNotIn(List<String> values) {
            addCriterion("Contactperson not in", values, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonBetween(String value1, String value2) {
            addCriterion("Contactperson between", value1, value2, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonNotBetween(String value1, String value2) {
            addCriterion("Contactperson not between", value1, value2, "contactperson");
            return (Criteria) this;
        }

        public Criteria andDataIsNull() {
            addCriterion("data is null");
            return (Criteria) this;
        }

        public Criteria andDataIsNotNull() {
            addCriterion("data is not null");
            return (Criteria) this;
        }

        public Criteria andDataEqualTo(String value) {
            addCriterion("data =", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotEqualTo(String value) {
            addCriterion("data <>", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataGreaterThan(String value) {
            addCriterion("data >", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataGreaterThanOrEqualTo(String value) {
            addCriterion("data >=", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLessThan(String value) {
            addCriterion("data <", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLessThanOrEqualTo(String value) {
            addCriterion("data <=", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLike(String value) {
            addCriterion("data like", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotLike(String value) {
            addCriterion("data not like", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataIn(List<String> values) {
            addCriterion("data in", values, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotIn(List<String> values) {
            addCriterion("data not in", values, "data");
            return (Criteria) this;
        }

        public Criteria andDataBetween(String value1, String value2) {
            addCriterion("data between", value1, value2, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotBetween(String value1, String value2) {
            addCriterion("data not between", value1, value2, "data");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("Telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("Telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("Telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("Telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("Telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("Telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("Telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("Telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("Telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("Telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("Telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("Telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("Telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("Telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(String value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(String value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(String value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(String value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(String value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(String value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLike(String value) {
            addCriterion("aid like", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotLike(String value) {
            addCriterion("aid not like", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<String> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<String> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(String value1, String value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(String value1, String value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andFzrIsNull() {
            addCriterion("fzr is null");
            return (Criteria) this;
        }

        public Criteria andFzrIsNotNull() {
            addCriterion("fzr is not null");
            return (Criteria) this;
        }

        public Criteria andFzrEqualTo(String value) {
            addCriterion("fzr =", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrNotEqualTo(String value) {
            addCriterion("fzr <>", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrGreaterThan(String value) {
            addCriterion("fzr >", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrGreaterThanOrEqualTo(String value) {
            addCriterion("fzr >=", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrLessThan(String value) {
            addCriterion("fzr <", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrLessThanOrEqualTo(String value) {
            addCriterion("fzr <=", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrLike(String value) {
            addCriterion("fzr like", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrNotLike(String value) {
            addCriterion("fzr not like", value, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrIn(List<String> values) {
            addCriterion("fzr in", values, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrNotIn(List<String> values) {
            addCriterion("fzr not in", values, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrBetween(String value1, String value2) {
            addCriterion("fzr between", value1, value2, "fzr");
            return (Criteria) this;
        }

        public Criteria andFzrNotBetween(String value1, String value2) {
            addCriterion("fzr not between", value1, value2, "fzr");
            return (Criteria) this;
        }

        public Criteria andSwdjhIsNull() {
            addCriterion("swdjh is null");
            return (Criteria) this;
        }

        public Criteria andSwdjhIsNotNull() {
            addCriterion("swdjh is not null");
            return (Criteria) this;
        }

        public Criteria andSwdjhEqualTo(String value) {
            addCriterion("swdjh =", value, "swdjh");
            return (Criteria) this;
        }

        public Criteria andSwdjhNotEqualTo(String value) {
            addCriterion("swdjh <>", value, "swdjh");
            return (Criteria) this;
        }

        public Criteria andSwdjhGreaterThan(String value) {
            addCriterion("swdjh >", value, "swdjh");
            return (Criteria) this;
        }

        public Criteria andSwdjhGreaterThanOrEqualTo(String value) {
            addCriterion("swdjh >=", value, "swdjh");
            return (Criteria) this;
        }

        public Criteria andSwdjhLessThan(String value) {
            addCriterion("swdjh <", value, "swdjh");
            return (Criteria) this;
        }

        public Criteria andSwdjhLessThanOrEqualTo(String value) {
            addCriterion("swdjh <=", value, "swdjh");
            return (Criteria) this;
        }

        public Criteria andSwdjhLike(String value) {
            addCriterion("swdjh like", value, "swdjh");
            return (Criteria) this;
        }

        public Criteria andSwdjhNotLike(String value) {
            addCriterion("swdjh not like", value, "swdjh");
            return (Criteria) this;
        }

        public Criteria andSwdjhIn(List<String> values) {
            addCriterion("swdjh in", values, "swdjh");
            return (Criteria) this;
        }

        public Criteria andSwdjhNotIn(List<String> values) {
            addCriterion("swdjh not in", values, "swdjh");
            return (Criteria) this;
        }

        public Criteria andSwdjhBetween(String value1, String value2) {
            addCriterion("swdjh between", value1, value2, "swdjh");
            return (Criteria) this;
        }

        public Criteria andSwdjhNotBetween(String value1, String value2) {
            addCriterion("swdjh not between", value1, value2, "swdjh");
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