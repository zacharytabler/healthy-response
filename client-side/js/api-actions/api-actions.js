function getRequest(location, callback) {
  fetch(location)
    .then((response) => response.json())
    .then((data) => callback(data))
    .catch((err) => console.log(err));
}

function getText(location, callback) {
  fetch(location)
    .then((response) => response.text())
    .then((data) => callback(data))
    .catch((err) => console.log(err));
}

function postText(location, requestBody, callback) {
  fetch(location, {
    method: "POST",
    body: JSON.stringify(requestBody),
  })
    .then((response) => response.text())
    .then((data) => callback(data))
    .catch((err) => console.log(err));
}

function postRequest(location, requestBody, callback) {
  fetch(location, {
    method: "POST",
    headers: {
      'Content-Type': 'application/json',
    },
    body: JSON.stringify(requestBody),
  })
    .then((response) => response.json())
    .then((data) => callback(data))
    .catch((err) => console.log(err));
}

function putRequest(location, requestBody, callback) {
  fetch(location, {
    method: "PUT",
    headers: {
      'Content-Type': 'application/json',
    },
    body: JSON.stringify(requestBody),
  })
    .then((response) => response.json())
    .then((data) => callback(data))
    .catch((err) => console.log(err));
}

function deleteRequest(location, callback) {
  fetch(location, {
    method: "DELETE",
    headers: {
      'Content-Type': 'application/json',
    },
    // body: JSON.stringify(requestBody),
  })
    // .then((response) => response.json())
    .then((data) => callback(data))
    .catch((err) => console.log(err));
}

export default {
  getRequest,
  getText,
  postRequest,
  postText,
  putRequest,
  deleteRequest,
};
