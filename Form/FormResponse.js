// /models/FormResponse.js
const mongoose = require('mongoose');

const answerSchema = new mongoose.Schema({
  questionId: { type: String, required: true },
  answer: mongoose.Schema.Types.Mixed // string, array, file URL etc.
}, { _id: false });

const formResponseSchema = new mongoose.Schema({
  formId: { type: mongoose.Schema.Types.ObjectId, ref: 'Form', required: true, index: true },
  response: [answerSchema],
  submittedAt: { type: Date, default: Date.now }
});

module.exports = mongoose.model('FormResponse', formResponseSchema);
