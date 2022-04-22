function handleTable() {
  const tableDataExists = document.querySelectorAll("table tbody tr");

  if (tableDataExists.length === 0) {
    const contentElement = document.querySelector("main div.content");

    const div = document.createElement("div");
    const h2 = document.createElement("h2");

    h2.innerHTML = `Não há dados cadastrados.`;

    div.append(h2);
    contentElement.append(div);

    div.classList.add("listEmpty");
    return;
  }

  tableDataExists.forEach(tr => {
    const td = tr.children;

    const id = td[0].textContent;

    const tdButtons = td[4].children;

    const updateButton = tdButtons[0].setAttribute(
      "href",
      `/animals/update/${id}`
    );

    const deleteButton = tdButtons[1].setAttribute(
      "href",
      `/animals/delete/${id}`
    );
  })
}

handleTable();