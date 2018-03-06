package org.wang.restmall.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


/**
 * DOCUMENT ME!
 *
 * @author   <a href="mailto:pin.wang@ozstrategy.com">Pin Wang</a>
 * @version  $Revision$, $Date$
 */
@Entity public class User {
  //~ Instance fields --------------------------------------------------------------------------------------------------

  @Cascade({ CascadeType.SAVE_UPDATE })
  @JoinTable(
    name               = "UserAddress",
    joinColumns        = {
      @JoinColumn(
        name           = "userId",
        nullable       = false,
        updatable      = false
      )
    },
    inverseJoinColumns = {
      @JoinColumn(
        name           = "addressId",
        nullable       = false,
        updatable      = false
      )
    }
  )
  @OneToMany private Set<Address> addressSet;

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id private Long id;

  @Column(
    length   = 12,
    nullable = false
  )
  private String name;

  @Column(
    length   = 16,
    nullable = false
  )
  private String passWord;

  //~ Methods ----------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public Set<Address> getAddressSet() {
    return addressSet;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public Long getId() {
    return id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public String getName() {
    return name;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @return  DOCUMENT ME!
   */
  public String getPassWord() {
    return passWord;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  addressSet  DOCUMENT ME!
   */
  public void setAddressSet(Set<Address> addressSet) {
    this.addressSet = addressSet;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  id  DOCUMENT ME!
   */
  public void setId(Long id) {
    this.id = id;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  name  DOCUMENT ME!
   */
  public void setName(String name) {
    this.name = name;
  }

  //~ ------------------------------------------------------------------------------------------------------------------

  /**
   * DOCUMENT ME!
   *
   * @param  passWord  DOCUMENT ME!
   */
  public void setPassWord(String passWord) {
    this.passWord = passWord;
  }
} // end class User
