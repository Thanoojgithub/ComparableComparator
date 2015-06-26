package com.comparablecomparator;

import java.util.Comparator;

class Book implements Comparable<Book> {

	private String author;
	private Integer cost;
	private String publisher;
	private String technology;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		result = prime * result
				+ ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result
				+ ((technology == null) ? 0 : technology.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (technology == null) {
			if (other.technology != null)
				return false;
		} else if (!technology.equals(other.technology))
			return false;
		return true;
	}

	public int compareTo(Book book) {
		if (this.getTechnology().compareTo(book.getTechnology()) == 0) {
			if (this.getPublisher().compareTo(book.getPublisher()) == 0) {
				if (this.getAuthor().compareTo(book.getAuthor()) == 0) {
					if (this.getCost() - book.getCost() == 0) {
						return 0;
					} else {
						if (this.getCost() - book.getCost() < 0) {
							return -1;
						} else {
							return 1;
						}
					}
				} else {
					if (this.getAuthor().compareTo(book.getAuthor()) < 0) {
						return -1;
					} else {
						return 1;
					}
				}
			} else {
				if (this.getPublisher().compareTo(book.getPublisher()) < 0) {
					return -1;
				} else {
					return 1;
				}
			}
		} else {
			if (this.getTechnology().compareTo(book.getTechnology()) < 0) {
				return -1;
			} else {
				return 1;
			}
		}

	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", cost=" + cost + ", publisher="
				+ publisher + ", technology=" + technology + "]";
	}

}

class BookSortWithTechnology implements Comparator<Book> {
	public int compare(Book o1, Book o2) {
		if (o1.getTechnology().compareTo(o2.getTechnology()) == 0) {
			return 0;
		} else {
			if (o1.getTechnology().compareTo(o2.getTechnology()) < 0) {
				return -1;
			} else {
				return 1;
			}
		}
	}

}

class BookSortWithPublisher implements Comparator<Book> {
	public int compare(Book o1, Book o2) {
		if (o1.getPublisher().compareTo(o2.getPublisher()) == 0) {
			return 0;
		} else {
			if (o1.getPublisher().compareTo(o2.getPublisher()) < 0) {
				return -1;
			} else {
				return 1;
			}
		}
	}
}

class BookSortWithAuthor implements Comparator<Book> {
	public int compare(Book o1, Book o2) {
		if (o1.getAuthor().compareTo(o2.getAuthor()) == 0) {
			return 0;
		} else {
			if (o1.getAuthor().compareTo(o2.getAuthor()) < 0) {
				return -1;
			} else {
				return 1;
			}
		}
	}
}

class BookSortWithCost implements Comparator<Book> {
	public int compare(Book o1, Book o2) {
		if (o1.getCost() - o2.getCost() == 0) {
			return 0;
		} else {
			if (o1.getCost() - o2.getCost() < 0) {
				return -1;
			} else {
				return 1;
			}
		}
	}
}
