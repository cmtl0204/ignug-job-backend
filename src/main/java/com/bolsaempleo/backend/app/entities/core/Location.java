package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the locations database table.
 * 
 */
@Entity
@Table(name="locations")
@NamedQuery(name="Location.findAll", query="SELECT l FROM Location l")
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name="alpha2_code")
	private String alpha2Code;

	@Column(name="alpha3_code")
	private String alpha3Code;

	@Column(name="calling_code")
	private String callingCode;

	private String capital;

	private String code;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="deleted_at")
	private Timestamp deletedAt;

	private String flag;

	private String name;

	private String region;

	private String subregion;

	private Object timezones;

	@Column(name="top_level_domain")
	private String topLevelDomain;

	@Column(name="type_id")
	private Long typeId;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to Location
	@ManyToOne
	@JoinColumn(name="parent_id")
	private Location location;

	//bi-directional many-to-one association to Location
	@OneToMany(mappedBy="location")
	private List<Location> locations;

	public Location() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAlpha2Code() {
		return this.alpha2Code;
	}

	public void setAlpha2Code(String alpha2Code) {
		this.alpha2Code = alpha2Code;
	}

	public String getAlpha3Code() {
		return this.alpha3Code;
	}

	public void setAlpha3Code(String alpha3Code) {
		this.alpha3Code = alpha3Code;
	}

	public String getCallingCode() {
		return this.callingCode;
	}

	public void setCallingCode(String callingCode) {
		this.callingCode = callingCode;
	}

	public String getCapital() {
		return this.capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getDeletedAt() {
		return this.deletedAt;
	}

	public void setDeletedAt(Timestamp deletedAt) {
		this.deletedAt = deletedAt;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getSubregion() {
		return this.subregion;
	}

	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}

	public Object getTimezones() {
		return this.timezones;
	}

	public void setTimezones(Object timezones) {
		this.timezones = timezones;
	}

	public String getTopLevelDomain() {
		return this.topLevelDomain;
	}

	public void setTopLevelDomain(String topLevelDomain) {
		this.topLevelDomain = topLevelDomain;
	}

	public Long getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public List<Location> getLocations() {
		return this.locations;
	}

	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}

	public Location addLocation(Location location) {
		getLocations().add(location);
		location.setLocation(this);

		return location;
	}

	public Location removeLocation(Location location) {
		getLocations().remove(location);
		location.setLocation(null);

		return location;
	}

}