package se.uu.ub.cora.alvin;

import java.util.Collection;

import se.uu.ub.cora.alvin.mixedstorage.db.AlvinDbToCoraConverterFactory;
import se.uu.ub.cora.bookkeeper.data.DataGroup;
import se.uu.ub.cora.bookkeeper.storage.MetadataStorage;
import se.uu.ub.cora.searchstorage.SearchStorage;
import se.uu.ub.cora.spider.data.SpiderReadResult;
import se.uu.ub.cora.spider.record.storage.RecordStorage;
import se.uu.ub.cora.sqldatabase.DataReader;

public class DbStorageSpy implements RecordStorage, MetadataStorage, SearchStorage {

	public DataReader dataReader;
	public AlvinDbToCoraConverterFactory converterFactory;

	public DbStorageSpy(DataReader dataReader, AlvinDbToCoraConverterFactory converterFactory) {
		this.dataReader = dataReader;
		this.converterFactory = converterFactory;
	}

	public static DbStorageSpy usingDataReaderAndConverterFactory(DataReader dataReader,
			AlvinDbToCoraConverterFactory converterFactory) {
		return new DbStorageSpy(dataReader, converterFactory);
	}

	@Override
	public DataGroup read(String type, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(String type, String id, DataGroup record, DataGroup collectedTerms,
			DataGroup linkList, String dataDivider) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteByTypeAndId(String type, String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean linksExistForRecord(String type, String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update(String type, String id, DataGroup record, DataGroup collectedTerms,
			DataGroup linkList, String dataDivider) {
		// TODO Auto-generated method stub

	}

	@Override
	public SpiderReadResult readList(String type, DataGroup filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SpiderReadResult readAbstractList(String type, DataGroup filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataGroup readLinkList(String type, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<DataGroup> generateLinkCollectionPointingToRecord(String type, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean recordsExistForRecordType(String type) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean recordExistsForAbstractOrImplementingRecordTypeAndRecordId(String type,
			String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection<DataGroup> getMetadataElements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<DataGroup> getPresentationElements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<DataGroup> getTexts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<DataGroup> getRecordTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<DataGroup> getCollectTerms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataGroup getSearchTerm(String searchTermId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataGroup getCollectIndexTerm(String collectIndexTermId) {
		// TODO Auto-generated method stub
		return null;
	}

}
