package act.db.mongodb;

import act.db.Dao;

public class MongoQuery<MODEL_TYPE> implements Dao.Query<MODEL_TYPE, MongoQuery<MODEL_TYPE>> {
    @Override
    public MongoQuery<MODEL_TYPE> offset(int pos) {
        return null;
    }

    @Override
    public MongoQuery<MODEL_TYPE> limit(int limit) {
        return null;
    }

    @Override
    public MongoQuery<MODEL_TYPE> orderBy(String... fieldList) {
        return null;
    }

    @Override
    public MODEL_TYPE first() {
        return null;
    }

    @Override
    public Iterable<MODEL_TYPE> fetch() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }
}
