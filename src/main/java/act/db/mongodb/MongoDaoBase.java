package act.db.mongodb;

import act.db.DaoBase;

import java.util.Collection;
import java.util.List;

public class MongoDaoBase<ID_TYPE, MODEL_TYPE>
        extends DaoBase<ID_TYPE, MODEL_TYPE, MongoQuery<MODEL_TYPE>> {

    @Override
    public MODEL_TYPE findById(ID_TYPE id) {
        return null;
    }

    @Override
    public MODEL_TYPE findLatest() {
        return null;
    }

    @Override
    public MODEL_TYPE findLastModified() {
        return null;
    }

    @Override
    public Iterable<MODEL_TYPE> findByIdList(Collection<ID_TYPE> idList) {
        return null;
    }

    @Override
    public MODEL_TYPE reload(MODEL_TYPE entity) {
        return null;
    }

    @Override
    public ID_TYPE getId(MODEL_TYPE entity) {
        return null;
    }

    @Override
    public MODEL_TYPE save(MODEL_TYPE entity) {
        return null;
    }

    @Override
    public void save(MODEL_TYPE entity, String fields, Object... values) {

    }

    @Override
    public List<MODEL_TYPE> save(Iterable<MODEL_TYPE> entities) {
        return null;
    }

    @Override
    public void delete(MODEL_TYPE entity) {

    }

    @Override
    public void delete(MongoQuery<MODEL_TYPE> query) {

    }

    @Override
    public void deleteById(ID_TYPE id) {

    }

    @Override
    public void deleteBy(String fields, Object... values) throws IllegalArgumentException {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void drop() {

    }

    @Override
    public MongoQuery<MODEL_TYPE> q() {
        return null;
    }

    @Override
    public MongoQuery<MODEL_TYPE> createQuery() {
        return null;
    }

    @Override
    public MongoQuery<MODEL_TYPE> q(String fields, Object... values) {
        return null;
    }

    @Override
    public MongoQuery<MODEL_TYPE> createQuery(String fields, Object... values) {
        return null;
    }
}
